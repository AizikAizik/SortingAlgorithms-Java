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
//        for (String number: newIp) {
//            if(! number.matches(regex)){
//                return false;
//            }
//        }
        double start = System.currentTimeMillis();
        for (String s : newIp) {
            try{
                int current = Integer.parseInt(s);
                if (current < 0 || current > 255) {
                    return false;
                } else if (s.length() > 3) {
                    return false;
                }else if(! s.matches(regex)){
                    return false;
                }
            }catch (NumberFormatException e){
                return false;
            }
        }
        double elapsed = System.currentTimeMillis() - start;
        System.out.println("elapsed time for algorithm took: "+ elapsed + " Milisecond(s)");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidateIpAddress("119.60.12.223"));
    }
}
