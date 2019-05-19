package rbxapi.javablox.model.common.mesh;

public class Vertex {
    private Vector3 position;
    private Vector3 normal;
    private Vector3 uv;

    public Vertex(Vector3[] vectors) {
        this.position = vectors[0];
        this.normal = vectors[1];
        this.uv = vectors[2];
    }

    public Vector3 getNormal() {
        return normal;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Vector3 getUv() {
        return uv;
    }
}
