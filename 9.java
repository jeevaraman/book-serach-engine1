public class NoteDataSource implements DataSource {

    private final Cursor _NotesCursor;
    private NoteRepository _NoteRepository;
    private int _RecordNumber = 0;
    private Note _CurrentNote;
    private int _TotalRecords;

    public NoteDataSource(Context ctx) {

        _NoteRepository = new NoteRepository(ctx);

        try {
            _NoteRepository.open();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        _NotesCursor = _NoteRepository.SelectAllNotes();

    }

}