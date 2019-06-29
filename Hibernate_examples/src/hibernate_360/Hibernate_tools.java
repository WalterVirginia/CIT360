package hibernate_360;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;



public class Hibernate_tools {

    /**
     * This file is how we are able to implement connections between
     * hibernate objects. This file has the tools that are utilized by
     * Hibernate.
     */

    private static final SessionFactory useSessionFactory = buildSessionFactory();

        private static SessionFactory buildSessionFactory(){

            try {

                /**
                 * This section creates the ServiceRegistry and uses the
                 * hibernate configuration file to do that.
                 */
                ServiceRegistry serviceReg = new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml").build();

                /**
                 * This part creates metadata using the ServiceRegistry
                 */
                Metadata metadata = new MetaDataSources(serviceReg).getMetadataBuilder().build();

                return metadata.getSessionFactoryBuilder().build();

            }
            catch(Throwable except){

                    System.err.println("Creation of Initial Session Factory failed." + except);
                    throw new ExceptionInInitializerError(except);
            }

            public static SessionFactory getSessionFactory(){
                return useSessionFactory;
            }

            public static void shutdown(){
                getSessionFactory().close();
            }




    }


}
