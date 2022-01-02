public class Camera extends Device{
    public Camera(String camera) {
        super(camera);
    }

    @Override
    public String on() {
        return "Camera-On";
    }

    @Override
    public String off() {
        return "Camera-Off";
    }
}
