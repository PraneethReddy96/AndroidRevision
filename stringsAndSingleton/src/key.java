public class key {

  private static key  name = null;

    private key(){

    }

    public static key getKeyInstance(){
        if(name == null){

            name = new key();

            return name;
        }
        else
            return name;
    }




}


