package pert10;

/**
 *
 * @author Metz
 */
public class Barang {
    
    public String kd, nm;
    public int jml;
    public double hrg, ttl, ub, uk;
    
    public double getHrg() {
        return hrg;
    }
    public void setHrg(double hrg) {
        this.hrg = hrg;
    }
    public int getJml() {
        return jml;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
    public String getKd() {
        return kd;
    }
    public void setKd(String kd) {
        this.kd = kd;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    public double getTtl() {
        ttl = jml * hrg;
        return ttl;
    }
    public void setTtl(double ttl) {
        this.ttl = ttl;
    }
    public double getUb() {
        return ub;
    }
    public void setUb(double ub) {
        this.ub = ub;
    }
    public double getUk() {
        uk = ub - ttl;
        return uk;
    }
    public void setUk(double uk) {
        this.uk = uk;
    }
    
    public void setSeleksiKd() {
        if (kd.equalsIgnoreCase("B001")){
            nm = "Pensil";
            hrg = 3000;
        }
        else if (kd.equalsIgnoreCase("B002")){
            nm = "Buku";
            hrg = 5000;
        } 
        else if (kd.equalsIgnoreCase("B003")){
            nm = "Penggaris";
            hrg = 1000;
        }
        else if (kd.equalsIgnoreCase("B004")){
            nm = "Penghapus";
            hrg = 500;
        }
        else {
            nm = "";
            hrg = 0;
        }
    }
    
}
