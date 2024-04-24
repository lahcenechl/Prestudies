package brightway_week_3.computer_shop;

class Computer {
    private String manufacturerName;
    private int processorSpeedMHz;
    private int ramSizeGB;
    private int hardDriveSizeGB;
    private int numUSBPorts;
    private double screenSizeInches;
    private String computerType;
    private boolean preinstalledOperatingSystem;
    private double purchasePrice;
    private double sellingPrice;

    public Computer() {
        // Default constructor
    }

    public Computer(String manufacturerName, double screenSizeInches, boolean preinstalledOperatingSystem, double purchasePrice, double sellingPrice) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInches = screenSizeInches;
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public Computer(String manufacturerName, int processorSpeedMHz, int ramSizeGB, int hardDriveSizeGB,
                    int numUSBPorts, double screenSizeInches, String computerType, boolean preinstalledOperatingSystem,
                    double purchasePrice, double sellingPrice) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramSizeGB = ramSizeGB;
        this.hardDriveSizeGB = hardDriveSizeGB;
        this.numUSBPorts = numUSBPorts;
        this.screenSizeInches = screenSizeInches;
        this.computerType = computerType;
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }



    // Getters and setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProcessorSpeedMHz() {
        return processorSpeedMHz;
    }

    public void setProcessorSpeedMHz(int processorSpeedMHz) {
        this.processorSpeedMHz = processorSpeedMHz;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getHardDriveSizeGB() {
        return hardDriveSizeGB;
    }

    public void setHardDriveSizeGB(int hardDriveSizeGB) {
        this.hardDriveSizeGB = hardDriveSizeGB;
    }

    public int getNumUSBPorts() {
        return numUSBPorts;
    }

    public void setNumUSBPorts(int numUSBPorts) {
        this.numUSBPorts = numUSBPorts;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public boolean isPreinstalledOperatingSystem() {
        return preinstalledOperatingSystem;
    }

    public void setPreinstalledOperatingSystem(boolean preinstalledOperatingSystem) {
        this.preinstalledOperatingSystem = preinstalledOperatingSystem;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }




    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // Method to manipulate double value of the Ram
    public int doubleValueOfRam(){
        if(ramSizeGB > 0){
            System.out.println(" The client didn't buy any Ram");
        }
        return getRamSizeGB()*2;
    }
    // toString method
    @Override
    public String toString() {
        return "Computer{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", processorSpeedMHz=" + processorSpeedMHz +
                ", ramSizeGB=" + ramSizeGB +
                ", hardDriveSizeGB=" + hardDriveSizeGB +
                ", numUSBPorts=" + numUSBPorts +
                ", screenSizeInches=" + screenSizeInches +
                ", computerType='" + computerType + '\'' +
                ", preinstalledOperatingSystem=" + preinstalledOperatingSystem +
                ", purchasePrice=" + purchasePrice +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}