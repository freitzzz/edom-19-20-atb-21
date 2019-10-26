package requirements.dsl.converter;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Author: ATB
 * see: http://pettergraff.blogspot.com/2009/11/xtext-valueconverter.html
 * see: http://wiki.eclipse.org/Xtext/Documentation/ValueConverter
 * see: https://www.eclipse.org/forums/index.php/t/352143/
 */
public class RDSLValueConverter extends DefaultTerminalConverters {
	
	// This rule converter parses strings as date times using LocalDateTime class
	// Rule is mapped by a STRING terminal with the return of an EDate
	// Converter supports dates in the following formats:
	// - YYYY-MM-DDTHH:MM:SS.{PRECISION} (e.g. 2019-10-26T18:51:52.009+0100)
	// - YYYY-MM-DDTHH:MM:SS (e.g. 2019-10-26T18:51:52)
	// - YYYY-MM-DD (e.g. 2019-10-26)
	// - YYYY/MM/DD (e.g. 2019/10/26)
	@ValueConverter(rule = "EDate")
	public IValueConverter<java.util.Date> EDate() {
		
		return new IValueConverter<java.util.Date>() {

			@Override
			public java.util.Date toValue(String string, INode node)
					throws ValueConverterException {
				String str2=string.substring(1, string.length()-1);
				
				LocalDateTime date = tryParseInYYYYMMDDTHHMMSSWithTimeZoneFormat(str2);
				
				if(date != null) {
					return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
				}
				
				date = tryParseInYYYYMMDDTHHMMSSFormat(str2);
				
				if(date != null) {
					return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
				}
				
				date = tryParseInYYYYMMDDFormat(str2);
				
				if(date != null) {
					return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
				}
				
				date = tryParseInYYYYMMDDFormatWithSlashes(str2);
				
				if(date != null) {
					return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
				}
				
				IllegalStateException dateDoesntFollowAcceptedFormats 
					= new IllegalStateException("Date: " + str2 + " does not follow supported formats");
				
				throw new ValueConverterException("could not parse date", node, dateDoesntFollowAcceptedFormats);
			}
			
			// Tries to parse a string to a LocalDateTime using YYYY-MM-DDTHH:MM:SS.{PRECISION} format
			private java.time.LocalDateTime tryParseInYYYYMMDDTHHMMSSWithTimeZoneFormat(String date) {
				try {
					
					return LocalDateTime.parse(date.split("\\.")[0]);
				}catch(Exception e) {
					return null;
				}
			}
			
			// Tries to parse a string to a LocalDateTime using YYYY-MM-DDTHH:MM:SS format
			private java.time.LocalDateTime tryParseInYYYYMMDDTHHMMSSFormat(String date) {
				try {
					return LocalDateTime.parse(date);
				}catch(Exception e) {
					return null;
				}
			}
			
			// Tries to parse a string to a LocalDateTime using YYYY-MM-DD format
			private java.time.LocalDateTime tryParseInYYYYMMDDFormat(String date) {
				try {
					return LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE);
				}catch(Exception e) {
					return null;
				}
			}
			
			// Tries to parse a string to a LocalDateTime using YYYY/MM/DD format
			private java.time.LocalDateTime tryParseInYYYYMMDDFormatWithSlashes(String date) {
				try {
					return LocalDateTime.parse(date.replaceAll("-", "/"), DateTimeFormatter.ISO_DATE);
				}catch(Exception e) {
					return null;
				}
			}
			
			@Override
			public String toString(java.util.Date value)
					throws ValueConverterException {
				return "'"+new SimpleDateFormat("yyyy-MM-dd").format(value)+"'";
			}
			
		};
		
	}
	
}