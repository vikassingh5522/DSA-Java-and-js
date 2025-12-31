
public class Binareg {
    public static void main(String[] args) {
        
    int arr[] = {10, 25, 30, 45, 50, 55, 60, 65, 70}; 
    int search = 60;
    int first = 0 ;
    int last = arr.length - 1;
    int  midno = (first + last) / 2;

    boolean found =false;


    while (first <= last) {
        if (arr[midno] == search) {
            System.out.println("element found index :"+ midno);
            found = true;
            break;
        } else if (arr[midno] < search){
            first = midno + 1;
        }else{
            last= midno - 1 ;
        }
         midno = (first +last) / 2 ;
    }
    if (first > last) {
        System.out.println("ele not found ");
    }


    }
    
}
