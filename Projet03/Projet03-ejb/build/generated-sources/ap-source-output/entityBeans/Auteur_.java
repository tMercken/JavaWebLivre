package entityBeans;

import entityBeans.Livre;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-01T21:48:38")
@StaticMetamodel(Auteur.class)
public class Auteur_ { 

    public static volatile CollectionAttribute<Auteur, Livre> livreCollection;
    public static volatile SingularAttribute<Auteur, Integer> id;
    public static volatile SingularAttribute<Auteur, String> nom;
    public static volatile SingularAttribute<Auteur, String> prenom;

}