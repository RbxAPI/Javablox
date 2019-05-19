package rbxapi.javablox.model.common.mesh;

public class MeshHeader {
    private short sizeofMeshHeader;
    private byte sizeofMeshVertex;
    private byte sizeofMeshFace;
    private int num_vertices;
    private int num_faces;

    public MeshHeader(short sizeofMeshHeader, byte sizeofMeshVertex, byte sizeofMeshFace, int num_vertices, int num_faces) {
        this.num_faces = num_faces;
        this.num_vertices = num_vertices;
        this.sizeofMeshFace = sizeofMeshFace;
        this.sizeofMeshHeader = sizeofMeshHeader;
        this.sizeofMeshVertex = sizeofMeshVertex;
    }

    public byte getFaceSize() {
        return sizeofMeshFace;
    }

    public byte getVertexSize() {
        return sizeofMeshVertex;
    }

    public int getFacesCount() {
        return num_faces;
    }

    public int getVerticesCount() {
        return num_vertices;
    }

    public short getHeaderSize() {
        return sizeofMeshHeader;
    }
}
