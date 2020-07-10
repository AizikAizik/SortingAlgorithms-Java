public class ValidateIP {

    private static boolean ValidateIpAddress(String ip){

        if(ip.length() == 0){
            return false;
        }
        String regex = "\\d+"; // regex for digits only
        String[] newIp = ip.split("\\.+"); // array of strings

        if(newIp.length != 4){
            return false;
        }

        for (String number: newIp) {
            if(! number.matches(regex)){
                return false;
            }
        }

        for (String s : newIp) {
            int current = Integer.parseInt(s);
            if (current < 0 || current > 255) {
                return false;
            } else if (s.length() > 3) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidateIpAddress("119.0ops.12.223"));
    }
}
