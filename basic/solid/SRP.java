package solid;

public class SRP {

    public class ValidatePerson{
        private int age;
        private String name;

        public ValidatePerson(int age, String name){
            this.age=age;
            this.name=name;
        }


        public boolean validateName(String name){
            if(name.length()>3){
                return true;
            }else{
                return false;
            }
        }

        public boolean validateAge(int age){
            if(age >18){
                return true;
            }else {
                return false;
            }
        }


    }

}
