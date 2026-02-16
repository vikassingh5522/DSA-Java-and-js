public class TowerofHonai {
    
        public static void towerOfHonai(int n, char source, char helper, char destination) {
            if (n == 0) {
                return;
            }
    
            // Move n-1 disks from source to helper
            towerOfHonai(n - 1, source, destination, helper);
    
            // Move the nth disk from source to destination
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
    
            // Move n-1 disks from helper to destination
            towerOfHonai(n - 1, helper, source, destination);
        }


    public static void main(String[] args) {

        int n = 3; // Number of disks

        // Call the towerOfHonai function
        towerOfHonai(n, 'A', 'B', 'C'); // A is the source, B is the helper, C is the destination

        
    }
}
