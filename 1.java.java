private void BindResultsToListView(List&lt;Note> foundNotes) {

    try {
        ArrayAdapter&lt;Note> dataAdapter = new ArrayAdapter&lt;Note>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1, foundNotes
        );
        ListView lv = (ListView) findViewById(R.id.searchNoteList);
        lv.setAdapter(dataAdapter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }

}