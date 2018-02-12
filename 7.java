@Override
public boolean getNextDoc() {

    if (_RecordNumber == _TotalRecords) return false;

    Log.w("GetNextDoc", "Totalrecords: " + String.valueOf(_TotalRecords) + " RecordNumber: " + String.valueOf(_RecordNumber));

    // Get the current note
    _RecordNumber++;
    _CurrentNote = new Note(_NotesCursor);
    _NotesCursor.move(1);

    return true;

}