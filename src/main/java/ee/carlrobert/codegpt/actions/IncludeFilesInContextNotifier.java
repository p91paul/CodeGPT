package ee.carlrobert.codegpt.actions;

import com.intellij.util.messages.Topic;
import ee.carlrobert.embedding.CheckedFile;
import java.util.List;

public interface IncludeFilesInContextNotifier {

  Topic<IncludeFilesInContextNotifier> FILES_INCLUDED_IN_CONTEXT_TOPIC =
      Topic.create("filesIncludedInContext", IncludeFilesInContextNotifier.class);

  void filesIncluded(List<CheckedFile> includedFiles);
}
