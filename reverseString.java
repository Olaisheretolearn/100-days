public class Exercise {
    public String reverse(String str)
    {
        if(str == null|| str.length() <=1){
        return str;
        // TODO
        //hello
    } 
 return reverse(str.substring(1)) + str.charAt(0);

}
}
