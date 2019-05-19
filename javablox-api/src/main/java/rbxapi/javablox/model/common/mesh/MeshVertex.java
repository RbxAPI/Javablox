package rbxapi.javablox.model.common.mesh;

public class MeshVertex {
    private float px, py, pz;
    private float nx, ny, nz;
    private float tu, tv, tw;

    private byte r, g, b, a;

    public MeshVertex(float px, float py, float pz, float nx, float ny, float nz, float tu, float tv, float tw, byte r, byte g, byte b, byte a) {
        this.px = px;
        this.py = py;
        this.pz = pz;
        this.nx = nx;
        this.ny = ny;
        this.nz = nz;
        this.tu = tu;
        this.tv = tv;
        this.tw = tw;
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public byte getA() {
        return a;
    }

    public byte getB() {
        return b;
    }

    public byte getG() {
        return g;
    }

    public byte getR() {
        return r;
    }

    public float getNx() {
        return nx;
    }

    public float getNy() {
        return ny;
    }

    public float getNz() {
        return nz;
    }

    public float getPx() {
        return px;
    }

    public float getPy() {
        return py;
    }

    public float getPz() {
        return pz;
    }

    public float getTu() {
        return tu;
    }

    public float getTv() {
        return tv;
    }

    public float getTw() {
        return tw;
    }
}
