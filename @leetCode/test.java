
class test {
    public static void main(String[] args) {
        problems p = new problems();
        char[] temp ={'1','2','3','4','5','6','7'};
        p.problem344(temp);
    }
}


class problems{
   public void problem344(char[] s){

    int left = 0;        
    int right = s.length-1;       
    
    while (left<right){
        var temp = s[left];
        s[left]=s[right];
        left ++;
        s[right]=temp;
        right --;
    }

    
   }
}