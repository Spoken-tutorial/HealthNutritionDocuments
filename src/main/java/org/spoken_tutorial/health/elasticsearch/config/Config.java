package org.spoken_tutorial.health.elasticsearch.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Value("${spring.applicationexternalPath.name}")
    public String BASE_PATH;
    @Value("${spring.applicationexternalPath.baseName}")
    public String BASE_NAME;
    @Value("${spring.allowed.file.extensions}")
    public String ALLOWED_EXTENSIONS;

    @Value("${spring.scanning.limit}")
    public int SCANNING_LIMIT;
    public int HANDLER_DATA = 10000000;
    public static final String STATUS = "status";
    public static final String STATUS_QUEUED = "queued";
    public static final String STATUS_PROCESSING = "processing";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_DONE = "done";
    public static final String STATUS_FAILED = "failed";
    public static final String REASON = "reason";
    public static final String STATUS_NOTFOUND = "notFound";
    public static final String PROCESSING_TIME = "processingTime";
    public static final String START_TIME = "startTime";
    public static final String END_TIME = "endTime";
    public static final String CHANGE_TIME = "changeTime";
    public static final String MODIFICATION_TIME = "modificationTime";
    public static final String CREATION_TIME = "creationTime";
    public static final String CURRENT_TIME = "currentTime";
    public static final String DOCUMENT_ID = "documentId";
    public static final String DOCUMENT_TYPE = "documentType";
    public static final String LANGUAGE = "language";
    public static final String RANK = "rank";
    public static final String SUCCESS = "success";
    public static final String ADD_DOCUMENT = "addDocument";
    public static final String UPDATE_DOCUMENT = "updateDocument";
    public static final String UPDATE_DOCUMENT_RANK = "updateDocumentRank";
    public static final String DELETE_DOCUMENT = "deleteDocument";
    public static final String DOCUMENT_TYPE_TUTORIAL_ORIGINAL_SCRIPT = "Tutorial_for_Original_Script";
    public static final String DOCUMENT_TYPE_TUTORIAL_TIME_SCRIPT = "Tutorial_for_Time_Script";
    public static final String DOCUMENT_TYPE_BROCHURE = "Brochure";
    public static final String DOCUMENT_TYPE_VERSION = "Version";
    public static final String DOCUMENT_TYPE_FILES_OF_BROCHURE = "Files_Of_Brochure";
    public static final String DOCUMENT_TYPE_RESEARCHPAPER = "ResearchPaper";

    public static final String QUEUE_ID = "queueId";
    public static final String QUEUE_TIME = "queueTime";
    public static final String RUNNING_DOCUMENT = "runningDocument";
    public static final String SKIPPED_DOCUMENT = "skippedDocument";
    public static final Long NO_TASK_SLEEP_TIME = 30L * 1000 * 2 * 3;
    public static final Long TASK_SLEEP_TIME = 10L * 1000 * 6;
    public static final int TIME_UNIT_FOR_WAIT = 60;

    public static String uploadDirectoryScriptHtmlFile = "Media/Content/Tutorial/ScriptHtmlFile/";
    public static String uploadDirectoryScriptHtmlFileforDownload = "Media/Content/Tutorial/ScriptDownloadHtmlFile/";
    public static String uploadDirectoryScriptOdtFileforDownload = "Media/Content/Tutorial/ScriptDownloadOdtFile/";
    public static String uploadDirectoryScriptJsonFile = "Media/Content/Tutorial/ScriptJsonFile/";
    public static String uploadDirectoryTimeScriptvttFile = "Media/Content/Tutorial/VttFile/";

}
