package cucumber.eclipse.steps.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;

import cucumber.eclipse.steps.integration.IStepDefinitions;
import cucumber.eclipse.steps.integration.Step;

public class StepDefinitions implements IStepDefinitions {

	public Set<Step> getSteps(IProject project) {
		Set<Step> steps = new HashSet<Step>();
		Step step = new Step();
		step.setSource(project.getFile("first.epm")); //method.getResource());
		step.setText("^regex$"); //getAnnotationText(annotation));
		step.setLineNumber(1); //getLineNumber(compUnit, annotation));
		step.setLang("en"); //cukeAnnotation.getLang());
		steps.add(step);
		return steps;
	}
}
