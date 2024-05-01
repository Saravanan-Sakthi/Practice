package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String regex = "wms\\\\.localmanageengine\\\\.com|(sdpodlabs|appsite24x7|alarmsone|melogger|alarmsonees|loggerone|mapps-alarmsone|nicmdm|nicendpointcentral|marketplace)\\\\.localmanageengine\\\\.com|(patch|sprints|desktopcentral|log360cloud|uem|mdm|desktopcentrallabs|desktopcentrallabcluster1|patchlabs|desktoptoolslabs|desktopcentralcluster1|endpointcentral|endpointcentral-agent0|endpointcentral-agent1|endpointcentral-agentp1|patch-agent0|remoteaccess-agent0|mdmpremium2|mdmpremium3|mdmlabpremium2|mdmlabpremium3|desktopcentrallabpremium3|desktopcentralpremium3)\\\\.localmanageengine\\\\.com|.*\\\\.localzoho\\\\.eu|.*\\\\.localzoho\\\\.com|localzoho\\\\.com|www\\\\.localitpulse\\\\.com|.*\\\\.localzohousercontent\\\\.com|discussions\\\\.localzohopublic\\\\.com|.*\\\\.localzohosandbox\\\\.com|(s247|plus|plusagent|wms|automation|poller|presite24x7|network|s247insight|applog|core)\\\\.localsite24x7\\\\.com|localzohodiscussions\\\\.com|(me-adsolutions|localforums)\\\\.manageengine\\\\.com|.*\\\\.localzohositescontent\\\\.com|zm\\\\.localzoho\\\\.com|(app|labapp|preapp|perfapp|debugapp)\\\\.creatorlocalhost\\\\.com|(app|labapp|preapp|perfapp|debugapp|integapp|platformapp|qaapp)\\\\.localzohocreator\\\\.com|.*\\\\.sdpondemand\\\\.localmanageengine\\\\.com|.*\\\\.localzohoecommercecontent\\\\.com|.*\\\\.solutions\\\\.localzoho\\\\.com|.*\\\\.localzohosandbox2\\\\.com|.*\\\\.sandbox\\\\.localzoho\\\\.com|localzohosecurepay\\\\.com|.*\\\\.localzohohc\\\\.com|desktoptools\\\\.localmanageengine\\\\.com|log360feeds\\\\.localmanageengine\\\\.com|sdpondemand\\\\.localmanageengine\\\\.com|pulse\\\\.localmanageengine\\\\.com|remoteaccess\\\\.localmanageengine\\\\.com|desk360\\\\.localmanageengine\\\\.com|.*\\\\.localcareerfront\\\\.com|local\\\\.trainercentral\\\\.com|family\\\\.localzillum\\\\.com|.*\\\\.localtrainercentral\\\\.com|stage\\\\.localnila\\\\.com|serve\\\\.localnila\\\\.com|localoffers\\\\.localzcommerce\\\\.com|.*\\\\.localqntrl\\\\.com|log360cloud-s1\\\\.localmanageengine\\\\.com|log360cloud-s2\\\\.localmanageengine\\\\.com|log360cloud-s3\\\\.localmanageengine\\\\.com|log360feeds-s1\\\\.localmanageengine\\\\.com|startwith\\\\.localzoho\\\\.com|(core|midserver|corehub)\\\\.localqntrl\\\\.com|.*\\\\.analyticslocalportal\\\\.com|.*\\\\.analyticsprelocalportal\\\\.com|.*\\\\.analyticsqaportal\\\\.com|.*\\\\.analyticszaswimportal\\\\.com|.*\\\\.analyticsprezaswimportal\\\\.com|cloudsecurityplus\\\\.localmanageengine\\\\.com|csplog360\\\\.localmanageengine\\\\.com|.*\\\\.localzohoiot\\\\.com|.*\\\\.localzohoiotsandbox-testapp\\\\.com|.*\\\\.localzohoiotsandbox\\\\.com|recruiter\\\\.localcareerfront\\\\.com|ide\\\\.localpali\\\\.io|.*\\\\.localzakya\\\\.com|.*\\\\.analyticszaclientportal\\\\.com|.*\\\\.analyticsclientportal\\\\.com|analyticsplus\\\\.localmanageengine\\\\.com|lzstratus\\\\.com|aistratus\\\\.com|(catalyst|plusinsight)\\\\.localsite24x7\\\\.com|.*\\\\.analyticspglocalportal\\\\.com|.*\\\\.localzohosandboxtwo\\\\.com|.*\\\\.solutions1\\\\.localzoho\\\\.com|stage1\\\\.localnila\\\\.com|developer\\\\.localbigin\\\\.com|console\\\\.localbigin\\\\.com|marketplace\\\\.localbigin\\\\.com|dev-sandbox\\\\.localbigin\\\\.com|.*\\\\.analyticszareviewportal\\\\.com|.*\\\\.analyticsprezareviewportal\\\\.com|platform\\\\.localbigin\\\\.com|.*\\\\.localvanihq\\\\.net|.*\\\\.localnila\\\\.com|.*\\\\.analyticszaswimdevportal\\\\.com|.*\\\\.analyticszaswimreviewportal\\\\.com|ei\\\\.endpointcentral\\\\.localmanageengine\\\\.com|prime\\\\.localmanageengine\\\\.com|(procurement|payroll)\\\\.localzohocreator\\\\.com|.*\\\\.localzohoplatformtwo\\\\.com|mdm\\\\.endpointcentral\\\\.localmanageengine\\\\.com|(nicendpointcentral|nicendpointcentrallabs|endpointcentralnic-agent0|nicmdm|nicmdmlabs|nicmdmmaster)\\\\.localmanageengine\\\\.com";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern);
    }
}
