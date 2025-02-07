public class helloworld {

    public class Box<T>{
        private T content;

        public void setContent(T content){
            this.content = content;
        }

        public T getContent(){
            return content;
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        str = str + " World";
        System.out.println(str);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.append(" World");
        System.out.println(sb3);

        String str1  = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
    
    }


}
