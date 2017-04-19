//
// This file was generated by the Jeddict
//
package org.ohdsi.webapi.study;

import java.io.Serializable;

public class StudyCCATrioPK implements Serializable {

	private Long target;

	private Long comparator;

	private Long outcome;

	private Integer cca;

	public StudyCCATrioPK() {
	}

	public StudyCCATrioPK(Long target, Long comparator, Long outcome, Integer cca) {
		this.target = target;
		this.comparator = comparator;
		this.outcome = outcome;
		this.cca = cca;
	}

	public Long getTarget() {
		return this.target;
	}

	public void setTarget(Long target) {
		this.target = target;
	}

	public Long getComparator() {
		return this.comparator;
	}

	public void setComparator(Long comparator) {
		this.comparator = comparator;
	}

	public Long getOutcome() {
		return this.outcome;
	}

	public void setOutcome(Long outcome) {
		this.outcome = outcome;
	}

	public Integer getCca() {
		return this.cca;
	}

	public void setCca(Integer cca) {
		this.cca = cca;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!java.util.Objects.equals(getClass(), obj.getClass())) {
			return false;
		}
		final StudyCCATrioPK other = (StudyCCATrioPK) obj;
		if (!java.util.Objects.equals(this.getTarget(), other.getTarget())) {
			return false;
		}
		if (!java.util.Objects.equals(this.getComparator(), other.getComparator())) {
			return false;
		}
		if (!java.util.Objects.equals(this.getOutcome(), other.getOutcome())) {
			return false;
		}
		if (!java.util.Objects.equals(this.getCca(), other.getCca())) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 73 * hash + (this.getTarget() != null ? this.getTarget().hashCode() : 0);
		hash = 73 * hash + (this.getComparator() != null ? this.getComparator().hashCode() : 0);
		hash = 73 * hash + (this.getOutcome() != null ? this.getOutcome().hashCode() : 0);
		hash = 73 * hash + (this.getCca() != null ? this.getCca().hashCode() : 0);
		return hash;
	}

	@Override
	public String toString() {
		return "StudyCCATrioPK{" + " target=" + target + ", comparator=" + comparator + ", outcome=" + outcome + ", cca=" + cca + '}';
	}

}
