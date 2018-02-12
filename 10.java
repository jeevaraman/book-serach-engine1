import android.database.Cursor;
import java.util.Date;

public class Note {

    private int id;
    private String title;
    private String content;
    private Date created;
    private Date modified;

    public Note() {}

    public Note(int id, String title, String content, Date created, Date modified) {
/** Omitted for brevity **/
    }

    public Note(Cursor c) {

/** Omitted for brevity **/

    }

    public int get_ID() {
        return id;
    }

    public void set_ID(int id) {
        this.id = id;
    }

    public String get_Title() {
        return title;
    }

    public void set_Title(String title) {
        this.title = title;
    }

    public String get_Content() {
        return content;
    }

    public void set_Content(String content) {
        this.content = content;
    }

    public Date get_Created() {
        return created;
    }

    public void set_Created(Date created) {
        this.created = created;
    }

    public Date get_Modified() {
        return modified;
    }

    public void set_Modified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return this.title;
    }

}