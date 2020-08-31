package exam.examinationContext.domain.model.examination;

import exam.paperContext.shared.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class ExaminationID implements ValueObject<ExaminationID> {
    private String id;

    public static ExaminationID nextId() {
        //TODO Generate ID
        return null;
    }

    @Override
    public boolean sameValueAs(ExaminationID other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExaminationID paperId = (ExaminationID) o;
        return Objects.equals(id, paperId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }
}
