package exam.examinationContext.domain.model.examination;

import exam.paperContext.domain.model.paper.PaperId;
import exam.paperContext.shared.Entity;

import java.time.LocalDateTime;

public class Examination implements Entity<Examination> {
    private ExaminationID examinationID;
    private PaperId paperId;
    private String teacherId;
    private LocalDateTime createTime;
    private LocalDateTime startTime;
    private LocalDateTime dueTime;

    public Examination(ExaminationID examinationID, PaperId paperId, String teacherId, LocalDateTime startTime, LocalDateTime dueTime) {
        this.examinationID = examinationID;
        this.paperId = paperId;
        this.teacherId = teacherId;
        this.startTime = startTime;
        this.dueTime = dueTime;
        createTime = LocalDateTime.now();
    }

    @Override
    public boolean sameIdentityAs(Examination other) {
        return examinationID.sameValueAs(other.getExaminationId());
    }

    public ExaminationID getExaminationId() {
        return examinationID;
    }

    public static Examination create(ExaminationID examinationID, PaperId paperId, String teacherId, LocalDateTime startTime, LocalDateTime dueTime) {
       return new Examination(examinationID, paperId, teacherId, startTime, dueTime);
    }
}
