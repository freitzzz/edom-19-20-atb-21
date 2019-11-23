package usecasestojavacli.main;

import java.util.ArrayList;
import java.util.List;

import pt.isep.edom.usecases.Actor;
import pt.isep.edom.usecases.Association;
import pt.isep.edom.usecases.Comment;
import pt.isep.edom.usecases.Include;
import pt.isep.edom.usecases.UseCase;
import pt.isep.edom.usecases.UseCaseModel;

public class JavaQuerier {

	public static boolean IsActorAssociation(UseCaseModel useCaseModel, Actor actor) {

		return !GetActorAssociations(useCaseModel, actor).isEmpty();

	}

	public static List<Association> GetActorAssociations(UseCaseModel useCaseModel, Actor actor) {

		List<Association> _associations = new ArrayList<Association>();

		List<Association> associations = useCaseModel.getAssociation();

		for (Association association : associations) {

			if (association.getActor().getName().equals(actor.getName())) {
				_associations.add(association);
			}
		}

		return _associations;
	}

	public static boolean IsCRUDUseCase(UseCase useCase) {

		List<Comment> comments = useCase.getComments();

		for (Comment comment : comments) {
			if (comment.getDescription().equals("CRUD")) {
				return true;
			}
		}

		return false;
	}

	public static List<Include> GetIncludedUseCases(UseCase useCase) {

		return useCase.getInclude();
	}

	public static boolean IsIncludeUseCase(UseCase useCase) {

		return !GetIncludedUseCases(useCase).isEmpty();
	}

	public static boolean IsEntityUseCase(UseCase useCase) {

		List<Comment> comments = useCase.getComments();

		for (Comment comment : comments) {
			if (comment.getDescription().equals("Entity")) {
				return true;
			}
		}

		return false;
	}

}
