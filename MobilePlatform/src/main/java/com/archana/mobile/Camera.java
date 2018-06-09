package com.archana.mobile;

class Camera {
    private int resolution;
    private boolean frontCamera;
    private boolean rearCamera;

    public Camera(int resolution, boolean frontCamera, boolean rearCamera) {
        this.resolution = resolution;
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
    }

    public int getResolution() {
        return resolution;
    }

    public boolean isRearCamera() {
        return rearCamera;
    }
}