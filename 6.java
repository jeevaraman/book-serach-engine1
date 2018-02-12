@Override
public String getDocText() {

    // The text of the note to index
    return _CurrentNote.get_Content();

}

@Override
public String getDocFields() {

    // Fields and content of the note to index for faceted search
    return "";
}

@Override
public String getDocName() {
    return String.valueOf(_CurrentNote.get_ID());
}

@Override
public String getDocDisplayName() {
    return _CurrentNote.get_Title();
}

@Override
public Calendar getDocModifiedDate() {

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(_CurrentNote.get_Modified());
    return calendar;

}

@Override
public Calendar getDocCreatedDate() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(_CurrentNote.get_Created());
    return calendar;
}