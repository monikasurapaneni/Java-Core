class CameraExecutor{
    public static void main(String[] args){

        Camera.power();

        int zoom = Camera.getZoom();
        System.out.println("Current Zoom: " + zoom);

        Camera.zoomIn();
        Camera.zoomIn();

        zoom = Camera.getZoom();
        System.out.println("Zoom after increase: " + zoom);

        Camera.zoomOut();

        zoom = Camera.getZoom();
        System.out.println("Zoom after decrease: " + zoom);
    }
}