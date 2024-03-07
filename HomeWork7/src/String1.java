public class String1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append("59\n")
                .append(a).append(" - ").append(b).append(" = ").append("-53\n")
                .append(a).append(" * ").append(b).append(" = ").append("168");
        System.out.println(sb);
        sb.replace(7,8,"equal");
        System.out.println(sb);
    }
}
