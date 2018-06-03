class Camera {
    private int resolution;
    private boolean frontCamera;
    private boolean rearCamera;

    public boolean isRearCamera() {
        return rearCamera;
    }

    public Camera(int resolution, boolean frontCamera, boolean rearCamera) {
        this.resolution = resolution;
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
    }

    public int getResolution() {

        return resolution;
    }
}