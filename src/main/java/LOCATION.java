public enum LOCATION {
    Compression_Land(0.025, 0.04, 0.015, 0.05);

    private final double motherBoardSurCharge;
    private final double cpuSurCharge;
    private final double ramSurCharge;
    private final double gpuSurCharge;


    LOCATION(double motherBoardSurCharge, double cpuSurCharge, double ramSurCharge, double gpuSurCharge) {
        this.motherBoardSurCharge = motherBoardSurCharge;
        this.cpuSurCharge = cpuSurCharge;
        this.ramSurCharge = ramSurCharge;
        this.gpuSurCharge = gpuSurCharge;
    }

    public double getMotherBoardSurCharge() {
        return this.motherBoardSurCharge;
    }

    public double getCpuSurCharge() {
        return cpuSurCharge;
    }

    public double getRamSurCharge() {
        return ramSurCharge;
    }

    public double getGpuSurCharge() {
        return gpuSurCharge;
    }
}
