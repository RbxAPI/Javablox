package rbxapi.javablox.model.common.mesh;

public class Polygon {
    private Vertex[] vertices;

    public Polygon(final Vertex v1, final Vertex v2, final Vertex v3) {
        this.vertices = new Vertex[]{v1, v2, v3};
    }

    public Vertex[] getVertices() {
        return vertices;
    }
}
