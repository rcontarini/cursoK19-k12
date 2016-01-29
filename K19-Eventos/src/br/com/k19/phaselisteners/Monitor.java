package br.com.k19.phaselisteners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class Monitor implements PhaseListener {

	public long inicio;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Monitor.afterPhase() - " + event.getPhaseId());
		System.out.println(System.currentTimeMillis());
		long fim = System.currentTimeMillis();
		System.out.println(fim - inicio);

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Monitor.beforePhase() - " + event.getPhaseId());
		System.out.println(System.currentTimeMillis());
		inicio = System.currentTimeMillis();

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;

	}

}
