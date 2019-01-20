public class Hanoi {
    int count;

    public Hanoi(int count) {
        this.count = count;
    }

    private void Hanoi_(int n,String A, String B, String C){
        if (n==1){
            Move(n,A,C);
        }else {
            Hanoi_(n-1,A,C,B);//将Ａ上其余的盘子通过Ｃ移动到Ｂ上
            Move(n,A,C);         //将Ａ移动到Ｃ上
            Hanoi_(n-1,B,A,C);//将Ｂ上的其余盘子通过Ａ移动到Ｃ上
        }
    }

    private void Move(int n,String A, String B){
            System.out.println("将第"+n+"盘子从"+A+"->"+B);
    }
    public static void main(String[] args){
        Hanoi hanoi = new Hanoi(7);
        hanoi.Hanoi_(4,"A","B","C");
    }

}
