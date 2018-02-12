public static List&lt;Note> DoSearch() {

    SearchJob job = new SearchJob();
    job.setIndexesToSearch(NoteDataSource.getIndexLocation(this).getAbsolutePath());
    job.setMaxFilesToRetrieve(10);
    job.setRequest(get_SearchText());
    job.setTimeoutSeconds(3);
    job.execute();

    return TransformResultsToNotes(job.getResults());

}