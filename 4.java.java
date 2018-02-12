public static void Rebuild(Context ctx) {

        IndexJob job = new IndexJob();
        NoteDataSource source = new NoteDataSource(ctx);
        job.setDataSourceToIndex(source);
        job.setIndexPath(getIndexLocation(ctx).getAbsolutePath());
        job.setActionCreate(true);
        job.setActionAdd(true);
        job.setCreateRelativePaths(true);
        job.setIndexingFlags(IndexingFlags.dtsIndexCacheTextWithoutFields | IndexingFlags.dtsIndexCacheText);

        job.execute();

        if (job.getErrors() != null && job.getErrors().getCount() > 0) {
            JobErrorInfo errors = job.getErrors();
            Log.w("Index Build", errors.getMessage(0));
        }

    }