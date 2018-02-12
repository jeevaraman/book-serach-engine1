@Override
public boolean rewind() {

    _RecordNumber = 0;
    _NotesCursor.moveToFirst();
    _TotalRecords = _NoteRepository.SelectAllNotes().getCount();

    return true;
}