package sanghee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];

//        dfs(0);
        backtracking();
    }

    public static void backtracking(){
//        System.out.print(v+" ");
//        visited[][v] = true;
//
//        for(int i : graph[v]){
//            if(!visited[i]){
//                dfs(i);
//            }
//        }
    }

    public static void dfs(int v){
        System.out.print(v+" ");
        visited[v] = true;

        for(int i : graph[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}