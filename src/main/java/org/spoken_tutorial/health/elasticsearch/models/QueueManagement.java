package org.spoken_tutorial.health.elasticsearch.models;

import java.sql.Timestamp;

import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spoken_tutorial.health.elasticsearch.JsonService.JsonService;
import org.spoken_tutorial.health.elasticsearch.config.Config;
import org.spoken_tutorial.health.elasticsearch.contentfile.ContentsfromFile;
import org.spoken_tutorial.health.elasticsearch.repositories.DocumentSearchRepository;
import org.spoken_tutorial.health.elasticsearch.repositories.QueueManagementRepository;
import org.spoken_tutorial.health.elasticsearch.threadpool.TaskProcessingService;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class QueueManagement implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(QueueManagement.class);

    @Autowired
    @Transient
    private DocumentSearchRepository docRepo;

    @Autowired
    @Transient
    private TaskProcessingService taskProcessingService;

    @Autowired
    @Transient
    private QueueManagementRepository queueRepo;

    @Autowired
    @Transient
    private ContentsfromFile contentsfromFile;

    @Autowired
    @Transient
    private JsonService jsonService;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "queueId", nullable = false, updatable = false)
    private long queueId;

    @Column(name = "requestTime", nullable = true, updatable = false)
    private Timestamp requestTime;

    @Column(name = "requestType", nullable = true)
    private String requestType;

    @Column(name = "status", nullable = true)
    private String status;

    @Column(name = "reason", nullable = true)
    private String reason;

    @Column(name = "startTime", nullable = true)
    private long startTime;

    @Column(name = "queueTime", nullable = true)
    private long queueTime;

    @Column(name = "endTime", nullable = true)
    private long endTime;

    @Column(name = "procesingTime", nullable = true)
    private long procesingTime;

    @Column(name = "documentId", nullable = true)
    private String documentId;

    @Column(name = "documentType", nullable = true)
    private String documentType;

    @Column(name = "documentPath", nullable = true)
    private String documentPath;

    @Column(name = "documentUrl", nullable = true)
    private String documentUrl;

    @Column(name = "rankView", nullable = true)
    private int rank;

    @Column(name = "viewUrl", nullable = true)
    private String viewUrl;

    @Column(name = "language", nullable = true)
    private String language;

    @Column(name = "languageId", nullable = true)
    private int languageId;

    @Column(name = "category", nullable = true)
    private String category;

    @Column(name = "categoryId", nullable = true)
    private int categoryId;

    @Column(name = "topic", nullable = true)
    private String topic;

    @Column(name = "topicId", nullable = true)
    private int topicId;

    @Column(name = "outlinePath", nullable = true)
    private String outlinePath;

    public long getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(long queueTime) {
        this.queueTime = queueTime;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getOutlinePath() {
        return outlinePath;
    }

    public void setOutlinePath(String outlinePath) {
        this.outlinePath = outlinePath;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getQueueId() {
        return queueId;
    }

    public void setQueueId(long queueId) {
        this.queueId = queueId;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getProcesingTime() {
        return procesingTime;
    }

    public void setProcesingTime(long procesingTime) {
        this.procesingTime = procesingTime;
    }

    public QueueManagement() {
        super();

    }

    public QueueManagement(long queueId, Timestamp request, String requestType, String status, long startTime,
            long endTime, long procesingTime) {
        super();
        this.queueId = queueId;
        this.requestTime = request;
        this.requestType = requestType;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.procesingTime = procesingTime;

    }

    public QueueManagement(long queueId, Timestamp requestTime, String requestType) {
        super();
        this.queueId = queueId;
        this.requestTime = requestTime;
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "QueueManagement [queueId=" + queueId + ", requestTime=" + requestTime + ", requestType=" + requestType
                + ", status=" + status + ", documentId=" + documentId + ", documentType=" + documentType + ", rank="
                + rank + ", language=" + language + "]";
    }

    @Override
    public void run() {

        logger.info("Processing:{}", this);

        DocumentSearch documentSearch = null;

        try {
            setStatus(Config.STATUS_PROCESSING);

            setStartTime(System.currentTimeMillis());

            documentSearch = docRepo.findByDocumentId(getDocumentId());
            if (getRequestType().equals(Config.ADD_DOCUMENT)) {

                if (documentSearch != null) {
                    setStatus(Config.STATUS_FAILED);
                    setReason("document alreday exist");
                    logger.error("document alreday exist");

                } else {
                    documentSearch = new DocumentSearch();
                    documentSearch.setDocumentId(getDocumentId());
                    documentSearch.setDocumentType(getDocumentType());
                    documentSearch.setLanguage(getLanguage());
                    documentSearch.setLanguageId(getLanguageId());
                    documentSearch.setCategory(getCategory());
                    documentSearch.setCategoryId(getCategoryId());
                    documentSearch.setTopic(getTopic());
                    documentSearch.setTopicId(getTopicId());
                    String path = getDocumentPath();

                    if (path.startsWith("https://")) {
                        path = jsonService.saveNarrationToFile(path, getDocumentId());
                    }
                    logger.info("path: {}", path);
                    Parser parser = new AutoDetectParser();
                    String content = contentsfromFile.extractContent(parser, path);

                    documentSearch.setDocumentContent(content);

                    if (getOutlinePath() != null) {
                        String outlinePath = getOutlinePath();
                        Parser parser1 = new AutoDetectParser();

                        String outlineContent = contentsfromFile.extractContent(parser1, outlinePath);
                        documentSearch.setOutlineContent(outlineContent);

                    }
                    documentSearch.setCreationTime(System.currentTimeMillis());

                    documentSearch.setRank(getRank());
                    documentSearch.setViewUrl(getViewUrl());
                    docRepo.save(documentSearch);
                    setStatus(Config.STATUS_DONE);

                }
            }

            else if (getRequestType().equals(Config.UPDATE_DOCUMENT)
                    || getRequestType().equals(Config.UPDATE_DOCUMENT_RANK)
                    || getRequestType().equals(Config.DELETE_DOCUMENT)) {

                if (documentSearch == null) {
                    setStatus(Config.STATUS_FAILED);
                    setReason("document id does not exist");
                    logger.error("document id does not exist");

                } else if (!getDocumentType().equals(documentSearch.getDocumentType())) {
                    setStatus(Config.STATUS_FAILED);
                    setReason("documentType mismatch");
                    logger.error("documentType mismatch");

                }

                else if (getLanguageId() != documentSearch.getLanguageId()) {
                    setStatus(Config.STATUS_FAILED);
                    setReason("language mismatch");
                    logger.error("language mismatch");

                }

                else {

                    if (getRequestType().equals(Config.UPDATE_DOCUMENT)) {
                        String path = getDocumentPath();
                        if (path.startsWith("https://")) {
                            path = jsonService.saveNarrationToFile(path, getDocumentId());
                        }
                        Parser parser = new AutoDetectParser();

                        String content = contentsfromFile.extractContent(parser, path);
                        documentSearch.setDocumentContent(content);

                        if (getOutlinePath() != null) {
                            String outlinePath = getOutlinePath();
                            Parser parser1 = new AutoDetectParser();

                            String outlineContent = contentsfromFile.extractContent(parser1, outlinePath);
                            documentSearch.setOutlineContent(outlineContent);

                        }

                        documentSearch.setModificationTime(System.currentTimeMillis());
                        if (getRank() != 0) {
                            documentSearch.setRank(getRank());
                            documentSearch.setChangeTime(System.currentTimeMillis());
                        }

                        docRepo.save(documentSearch);
                        setStatus(Config.STATUS_DONE);

                    }

                    else if (getRequestType().equals(Config.UPDATE_DOCUMENT_RANK)) {

                        if (getRank() != 0) {
                            documentSearch.setRank(getRank());
                            documentSearch.setChangeTime(System.currentTimeMillis());
                        }

                        docRepo.save(documentSearch);
                        setStatus(Config.STATUS_DONE);

                    }

                    else if (getRequestType().equals(Config.DELETE_DOCUMENT)) {
                        docRepo.delete(documentSearch);
                        setStatus(Config.STATUS_DONE);

                    }

                }
            }

        }

        catch (Exception e) {
            setStatus(Config.STATUS_FAILED);
            setReason("Exception Message");

            logger.error("Exception", e);
        }

        finally {

            setEndTime(System.currentTimeMillis());
            setProcesingTime(endTime - startTime);
            logger.info("Done :{}", this);

            queueRepo.save(this);
            taskProcessingService.getRunningDocuments().remove(documentId);
        }

    }

}
