public class MytestingClass {
    private int id;
    private String name;

    public MytestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MytestingClass)) {
            return false;
        }
        MytestingClass other = (MytestingClass) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MytestingClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
