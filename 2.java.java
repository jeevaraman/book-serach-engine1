private static List&lt;Note> TransformResultsToNotes(SearchResults results) {

    List&lt;Note> foundNotes = new ArrayList&lt;Note>(results.getCount());
    Log.w("Search", "Result count: " + results.getCount());

    for (int i=0; i&lt;results.getCount(); i++) {
        results.getNthDoc(i);
          foundNotes.add(new Note(results.getDocId(), results.getDocDisplayName(), "DOC TEXT", results.getDocDate(), results.getDocDate() ));
    }

    return foundNotes;

}