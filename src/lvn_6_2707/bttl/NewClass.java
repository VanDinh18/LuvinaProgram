package lvn_6_2707.bttl;

public class NewClass {

    public static void A() throws Exception {
        try{
            System.out.println("truoc ngoai le");
            float x = 1/0;
            System.out.println("sau ngoai le");
        }catch (Exception e){
            throw new Exception();
        }finally {
            System.out.println("trong finally");
        }
        System.out.println("ngoai try catch");
    }

    public static void main(String[] args){
        try{
            A();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
