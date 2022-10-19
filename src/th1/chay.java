package th1;

public class chay {
    private static EmailExxample emailExxample;
    public static final String[] validEmail = new String[]{
            "a@gmail.com", "ab@yahoo.com","abc@hotmail.com"
    };
    public static final String[] invalidEmail = new String[] {
            "@gmail.com","ab@gmail.","@#abc@gmail.com"
    };


    public static void main(String[] args) {
        emailExxample =new EmailExxample();
        System.out.println("Nhap vao 1 eMail : ");
//        Scanner sc = new Scanner(System.in);
//        String inputEmail = sc.nextLine();
//        boolean isvalid = emailExamole.validate(inputEmail);
//        System.out.println("Ket qua : " + isvalid);

        for (String email :validEmail) {
            boolean isvalid = emailExxample.validate(email);
            System.out.println("Email is " + email + " is valid: => " + isvalid) ;
        }
        for (String email : invalidEmail
        ) {

            boolean isvalid = emailExxample.validate(email);
            System.out.println("Email is " + email + " is valid: => " + isvalid);
        }


    }
}
