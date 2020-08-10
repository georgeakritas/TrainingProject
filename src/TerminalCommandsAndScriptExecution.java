public class TerminalCommandsAndScriptExecution {
    /**
     * Command Class
     *import java.io.BufferedReader;
     * import java.io.IOException;
     * import java.io.InputStreamReader;
     *
     * public class ProcessBuilderExample1 {
     *
     *     public static void main(String[] args) {
     *
     *         ProcessBuilder processBuilder = new ProcessBuilder();
     *         // Windows
     *         processBuilder.command("cmd.exe", "/c", "ping -n 3 google.com");
     *
     *         try {
     *
     *             Process process = processBuilder.start();
     *
     *             BufferedReader reader =
     *                     new BufferedReader(new InputStreamReader(process.getInputStream()));
     *
     *             String line;
     *             while ((line = reader.readLine()) != null) {
     *                 System.out.println(line);
     *             }
     *
     *             int exitCode = process.waitFor();
     *             System.out.println("\nExited with error code : " + exitCode);
     *
     *         } catch (IOException e) {
     *             e.printStackTrace();
     *         } catch (InterruptedException e) {
     *             e.printStackTrace();
     *         }
     *
     *     }
     *
     * }
     *
     */

    /**
     * Script Class
     *try {
     *
     * 		// -- Linux --
     *
     * 		// Run a shell command
     * 		// Process process = Runtime.getRuntime().exec("ls /home/mkyong/");
     *
     * 		// Run a shell script
     * 		// Process process = Runtime.getRuntime().exec("path/to/hello.sh");
     *
     * 		// -- Windows --
     *
     * 		// Run a command
     * 		//Process process = Runtime.getRuntime().exec("cmd /c dir C:\\Users\\mkyong");
     *
     * 		//Run a bat file
     * 		Process process = Runtime.getRuntime().exec(
     * 				"cmd /c hello.bat", null, new File("C:\\Users\\mkyong\\"));
     *
     * 		StringBuilder output = new StringBuilder();
     *
     * 		BufferedReader reader = new BufferedReader(
     * 				new InputStreamReader(process.getInputStream()));
     *
     * 		String line;
     * 		while ((line = reader.readLine()) != null) {
     * 			output.append(line + "\n");
     *                }
     *
     * 		int exitVal = process.waitFor();
     * 		if (exitVal == 0) {
     * 			System.out.println("Success!");
     * 			System.out.println(output);
     * 			System.exit(0);
     *        } else {
     * 			//abnormal...
     *        }
     ** 	} catch (IOException e) {
     * 		e.printStackTrace();
     * 	}     catch (InterruptedException e) {
     * 		e.printStackTrace();
     *    }
     *
     * }
     *
     */

}
