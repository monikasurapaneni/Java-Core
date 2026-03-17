class Camera{

    static int maxZoom = 10;
    static int minZoom = 1;
    static int currentZoom = 1;
    static boolean isOn;

    static void power(){
        if(isOn == false){
            isOn = true;
        }else{
            isOn = false;
        }
    }

    static int getZoom(){
        return currentZoom;
    }

    static void zoomIn(){
        if(isOn){
            if(currentZoom < maxZoom){
                currentZoom++;
                System.out.println("Zoom increased to: " + currentZoom);
            }else{
                System.out.println("Maximum zoom reached");
            }
        }else{
            System.out.println("Camera is off");
        }
    }

    static void zoomOut(){
        if(isOn){
            if(currentZoom > minZoom){
                currentZoom--;
                System.out.println("Zoom decreased to: " + currentZoom);
            }else{
                System.out.println("Minimum zoom reached");
            }
        }else{
            System.out.println("Camera is off");
        }
    }
}