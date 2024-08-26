class Addition{
    public int add(int x,int y){
        return x+y;
    }
}
class Methodoverloading{
    public static void main(String[] args){
        Addition adding = main Addition();
        int i = adding.add(2,3);
        System.out.println(i);
    }
}