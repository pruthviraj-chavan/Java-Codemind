public class Container {
    private int capacity;
    private int currentVolume;

    public Container(int capacity) {
        this.capacity = capacity;
        this.currentVolume = 0;
    }

    public void pourIn(int amount) {
        int spaceAvailable = capacity - currentVolume;
        if (amount <= spaceAvailable) {
            currentVolume += amount;
            System.out.println("Pouring in " + amount + " units. Current volume: " + currentVolume);
        } else {
            System.out.println("Not enough space in the container!");
        }
    }

    public void pourOut(int amount) {
        if (amount <= currentVolume) {
            currentVolume -= amount;
            System.out.println("Pouring out " + amount + " units. Current volume: " + currentVolume);
        } else {
            System.out.println("Not enough liquid in the container!");
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        Container container = new Container(100); // Create a container with a capacity of 100 units
        container.pourIn(50); // Pour in 50 units
        container.pourOut(20); // Pour out 20 units

        System.out.println("Current volume: " + container.getCurrentVolume());
        System.out.println("Container capacity: " + container.getCapacity());
    }
}
