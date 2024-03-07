package encoderproj;

public class EncoderProj {

    private String RefTable= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
    private String encodedString = "";
    private int offsetamt;
    private int temp;
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);                
            }
        });
    }
    
    public String controller (String OpsType, String plaintext){
        plaintext = plaintext.toUpperCase();
        this.offsetamt = RefTable.indexOf(plaintext.charAt(0));
        switch (OpsType){
            case "Encode"-> {   
                return encode(plaintext);
            }
            case "Decode"-> {
                return decode(plaintext);
            }
            default-> {
                return "An Error has occured";
            }
        }
                
        
    }
    
    private String encode (String plaintext){
        encodedString += plaintext.charAt(0);
        
        for (int i = 1; i<plaintext.length(); i++){
            
            if (RefTable.contains(plaintext.subSequence(i,i+1))){
                
                temp = RefTable.indexOf(plaintext.charAt(i));
                temp = ((temp>offsetamt) ? temp-offsetamt: temp+44-offsetamt);
                encodedString +=RefTable.charAt(temp);
                
            } else{
                
                encodedString +=plaintext.charAt(i);
            }
            
        }

        return encodedString;
    }
    
    private String decode (String encodedtext){

        for (int i = 1; i<encodedtext.length(); i++){
            
            if (RefTable.contains(encodedtext.subSequence(i,i+1))){
                
                temp = offsetamt + RefTable.indexOf(encodedtext.charAt(i));
                temp = ((temp>44) ? temp-44: temp);
                encodedString +=RefTable.charAt(temp);
                
            } else{
                
                encodedString +=encodedtext.charAt(i);
            }
            
        }

        return encodedString;
    }
    
}
