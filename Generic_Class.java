//Que 8

class CustomExp extends Exception{


    public String throwWarning() {
        return "SAY NO TO STRINGS DUDE!"; //Custom Message
    }

}
class ClassToTestGenerics{

    public <T> void theGenericFunction(T... kwargs){
        int temp = (kwargs.length * 2)/3;
        try{


            for(T t : kwargs){ // Iterating in kwargs to check if any string is there
                if(t instanceof String){ // returns true is string found
                    throw new CustomExp();
                }
            }


            for(int i=0;i<= temp;i ++){
                System.out.println(kwargs[i]);
            }
        }catch(CustomExp exp){
            System.out.println(exp.throwWarning());
        }
    }
}

public class Generic_Class {

    Generic_Class(){
        ClassToTestGenerics gen = new ClassToTestGenerics();


        gen.theGenericFunction("testing_Condition: Lpu suck jk Don't Debard Me!",99,22,100,22,0);


        gen.theGenericFunction(420,9211);

    }

    public static void main(String[] args) {
       Generic_Class g = new Generic_Class(); // Object Creation for testing
    }

}