

public class FactoryProducer {

        public static CarFactory getFactory(String region){
            if (region.equalsIgnoreCase("USA")) {
                return new UsaCarFactory();
            }
            else 
                return new AsiaCarFactory();
            
        }
}
